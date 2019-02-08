package com.collections;

import java.util.Scanner;

public class Collections04 {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		String option = "y";
		Scanner sc = new Scanner(System.in);

		while (!option.equalsIgnoreCase("n")) {
			System.out.println(
					"Enter choice:\n1.New Node\n2.Delete Node\n3.Search Node\n4.Display list\n5.Update Node\n6.Reverse list");
			int ch;
			ch = sc.nextInt();
			switch (ch) {
			case 1: {
				System.out.println("Enter choice:\n1.At Front\n2.At End\n3.In between");
				ch = sc.nextInt();
				System.out.println("Enter data");
				int d = sc.nextInt();
				Collections04 cc = new Collections04();
				switch (ch) {
				case 1: {
					cc.addNewNodeAtFront(d);
					System.out.println("Added");
					break;

				}
				case 2: {
					cc.addNewNodeAtEnd(d);
					System.out.println("Added");
					break;
				}
				case 3: {
					cc.addNewNodeInBetween(d);
					System.out.println("Added");
					break;
				}
				}

			}
			case 2: {
			}
			case 3: {
			}
			case 4: {
				System.out.println("List:");
				Node last = head;
				while (last != null) {
					System.out.print(last.data + " -> ");
					last = last.next;
				}
			}
			case 5: {
			}
			case 6: {
			}
			}

			System.out.println("Press y to continue and any other key to exit");
			option = sc.next();
		}
	}

	private void addNewNodeInBetween(int d) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter choice:\n1.From begining\n2.From Ending");
		int ch=sc.nextInt();
		System.out.println("Enter position");
		int pos=sc.nextInt();

		switch(ch)
		{
		case 1:{}
		case 2:{}
		}
		
	}

	private void addNewNodeAtFront(int d) {

		Node newNode = new Node(d);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}

	}

	private void addNewNodeAtEnd(int d) {
		Node newNode = new Node(d);
		if (head == null) {
			head = newNode;
			System.out.println(newNode.data);
		} else {
			Node last = head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;

		}
	}
}
