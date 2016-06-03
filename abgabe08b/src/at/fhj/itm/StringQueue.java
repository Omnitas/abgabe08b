package at.fhj.itm;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * @author Daniel
 * 
 * 	Creates a Queue with an ArrayList
 * 	Based on the Interface Queue
 *
 */
public class StringQueue implements Queue {

	private ArrayList<String> queue = new ArrayList<String>();
	private int maximum=0;
	
	public StringQueue(int maximum){
		this.maximum=maximum;
	}
	
	public StringQueue(){
		this.maximum=0;
	}
	
	
/**
 * 
 * Adds the String obj to the queue
 * If the addition is succesful, the method returns true
 * @param obj
 * @return
 * 
 */
	@Override
	public boolean offer(String obj) {
		int size = queue.size();
		
		if(size<maximum || maximum==0){
			queue.add(obj);
			return true;
		}
		else {
		return false;
		}
	}
	
/**
 * 
 * Gets the first Element of the queue and deletes it.
 * If there is no Element the method returns null
 * @return
 * 
 */
	@Override
	public String poll() {
		if(queue.size()>0){
			String element = queue.get(0);
			queue.remove(0);
			return element;
		} else {
		return null;
		}
	}
	
	
/**
 * 
 * Gets the first Element from the Queue and deletes it
 * But throws an NoSuchElementException if the Queue is empty
 * @return
 * 
 */
	@Override
	public String remove() {
		if(queue.size()>0){
			String element = queue.get(0);
			queue.remove(0);
			return element;
		} else {
			throw new NoSuchElementException("no such element");
		}
	}

/**
 * 
 * Gets the first Element from the Queue but doesn't delete it
 * Returns null if the queue is empty
 * @return
 * 
 */
	@Override
	public String peek() {
		if(queue.size()>0){
			String element = queue.get(0);
			return element;
		} else {
		return null;
		}
	}

/**
 * 
 * Gets the first Element from the Queue but doesn't delete it 
 * Throws an NoSuchElementException if the queue is empty
 * @return
 * 
 */
	@Override
	public String element() {
		if(queue.size()>0){
			String element = queue.get(0);
			return element;
		} else {
			throw new NoSuchElementException("no such element");
		}
	}
}
