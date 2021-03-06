package com.bridgelabz.queue;

public class QueueOperations {
	Node front, rear;

	public QueueOperations() {
		this.front = this.rear = null;
	}

	// Method to add an key to the queue.

	void addQ(int key) {

		// Create a new LL node
		Node temp = new Node(key);

		// If queue is empty, then new node is front and rear both
		if (this.rear == null) {
			this.front = this.rear = temp;
			return;
		}

		// Add the new node at the end of queue and change rear
		this.rear.next = temp;
		this.rear = temp;
	}

	// Method to remove an key from queue
	void dequeue() {
		// If queue is empty, return NULL
		if (this.front == null)
			return;

		// Store previous front and move front one node ahead
		Node temp = this.front;
		this.front = this.front.next;

		// If front becomes NULL, then change rear also as NULL
		if (this.front == null)
			this.rear = null;
	}

}