package com.kgd.epam.task1;

public class List<T> {
	private ListElement<T> head;
	private ListElement<T> tail;

	public void addFront(T data) {
		ListElement<T> a = new ListElement<T>();
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
		ListElement<T> a = new ListElement<>();
		a.setData(data);
		if (tail == null) {
			head = a;
			tail = a;
		} else {
			tail.setNext(a);

			tail = a;

		}
	}

	public void del(T data) {
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

		ListElement<T> t = head;
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

	public void printList() {
		ListElement<T> t = head;
		while (t != null) {
			System.out.print(t.getData() + " ");
			t = t.getNext();
		}
	}

	public ListElement<T> search(T data) { // search by value
		ListElement<T> t = head;
		while (t != null) {
			if (t.getData().equals(data)) {
				return t;
			}
			t = t.getNext();
		}
		return null;

	}

	public void middleInsert(T data) {

		if (head == null) {
			addBack(data);
			return;
		}

		ListElement<T> a = new ListElement<>();
		a.setData(data);

		int size = 0;
		ListElement<T> t = head;

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
}

class ListElement<E> {
	private ListElement<E> next;
	private E data;

	public ListElement<E> getNext() {
		return next;
	}

	public void setNext(ListElement<E> next) {
		this.next = next;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}
}