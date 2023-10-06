To reverse a singly linked list in C++, you can follow these steps:


	•	A Node structure to represent each element in the linked list.
	•	Each Node contains an integer data field to store the value and a next pointer to point to the next node in the list. Initially, next is set to nullptr.
	•	A constructor is provided to easily create new nodes and initialize their data and next fields.
	•	This function inserts a new node with the given value val at the beginning of the linked list.
	•	It takes a reference to the head of the list (Node*& head) because the head of the list may change when inserting at the beginning.
	•	It creates a new node (newNode) with the given value.
	•	It sets the next of the new node to point to the current head of the list, effectively making the new node the new head.
	•	Finally, it updates the head to point to the newly inserted node.
	•	This function reverses the given linked list and returns the new head of the reversed list.
	•	It uses three pointers: prev, current, and next.
	•	prev is initially set to nullptr, as there is no previous node before the head.
	•	current is set to the head of the original list.
	•	next is used to temporarily store the next node in the original list.
	•	The while loop iterates through the list:
	•	next is updated to point to the next node in the original list.
	•	current->next is reversed to point to the prev node (reversing the direction).
	•	prev is updated to the current node.
	•	current is updated to the next node.
	•	Once the loop completes, prev will point to the new head of the reversed list, so it returns prev.
	•	This function is used to print the elements of the linked list.
	•	It starts from the head and traverses the list, printing each element's data value followed by an arrow (->).
	•	It continues until it reaches the end of the list, where it prints "nullptr" to indicate the end.
	•	In the main function, a head pointer is initialized to nullptr to represent an empty linked list.
	•	Several elements are inserted at the beginning of the original linked list using the insertAtBeginning function.
	•	The original linked list is printed to the console to show its contents.
	•	Then, the reverseLinkedList function is called to reverse the linked list, and the new head is assigned back to the head pointer.
	•	Finally, the reversed linked list is printed to the console to show the reversed order.
	•	When you run this program, you'll see the original linked list and the reversed linked list printed to the console. The reversal is achieved by modifying the next pointers of each node in the list to reverse their order.
