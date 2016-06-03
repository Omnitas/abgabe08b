package at.fhj.itm;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class StringQueue implements Queue {

	private ArrayList<String> queue = new ArrayList<String>();
	private int maximum=0;
	
	public StringQueue(int maximum){
		this.maximum=maximum;
	}
	
	public StringQueue(){
		this.maximum=0;
	}
	
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

	@Override
	public String peek() {
		if(queue.size()>0){
			String element = queue.get(0);
			return element;
		} else {
		return null;
		}
	}

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
