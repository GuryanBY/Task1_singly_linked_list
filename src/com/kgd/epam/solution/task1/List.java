package com.kgd.epam.solution.task1;

public class List<T> {
	private Element<T> head;
	private Element<T> tail;

	public void addFront(T data) {
		Element<T> a = new Element<T>();
		a.setData(data);

		if (head == null) {
			head = a;
			tail = a;
		} else {
			a.setNext(head);
			head = a;
		}
	}

	public void add(T data) {
		addFront(data);
	}

	public void addBack(T data) {
		Element<T> a = new Element<>();
		a.setData(data);
		if (tail == null) {
			head = a;
			tail = a;
		} else {
			tail.setNext(a);

			tail = a;

		}
	}

	public void delete(T data) {
		if (head == null) {
			return;
		}

		if (head == tail) {
			head = null;
			tail = null;
			return;
		}

		if (head.getData().equals(data)) {
			head = head.getNext();

			return;
		}

		Element<T> t = head;
		while (t.getNext() != null) {
			if (t.getNext().getData().equals(data)) {
				if (tail == t.getNext()) {
					tail = t;
				}
				t.setNext(t.getNext().getNext());
				return;
			}
			t = t.getNext();
		}
	}

	public String printList() {
		Element<T> t = head;
		String result = "";
		while (t != null) {
			result = result.concat(t.toString() + "\n");
			t = t.getNext();
		}
		return result;
	}

	public int search(T data) { // search by value, return position of element
		Element<T> t = head;
		int position = 0;
		while (t != null) {
			position++;
			if (t.getData().equals(data)) {

				return position - 1;
			}
			t = t.getNext();
		}
		return -1;

	}

	public void middleInsert(T data) {

		if (head == null) {
			addBack(data);
			return;
		}

		Element<T> a = new Element<>();
		a.setData(data);

		int size = 0;
		Element<T> t = head;

		while (t != null) {
			size++;
			t = t.getNext();
		}
		t = head;
		for (int i = 0; i < (size / 2 - 1); i++) {
			t = t.getNext();
		}

		a.setNext(t.getNext());
		t.setNext(a);

	}

	class Element<E> {
		private Element<E> next;
		private E data;

		private Element<E> getNext() {
			return next;
		}

		private void setNext(Element<E> next) {
			this.next = next;
		}

		private E getData() {
			return data;
		}

		private void setData(E data) {
			this.data = data;
		}
	}
}
