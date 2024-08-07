# Linked List
  a data structure represents a sequence of nodes.   
  a `singly linked list` gives  each node points to the next node.   
  a `doubly linked list` gives each node pointers to node the next node and the previous node.
  
### Unlike an array :
 - When searching for a specific node, a linked list does not provide constant time access (`O(1)`). To find the Nth element in the linked list, you need to iterate through N elements.
 - Arrays have a fixed size, meaning they cannot be easily resized. Adding or deleting elements in an array requires creating a new array and copying the elements. However, in a linked list, you can insert or delete a node by only knowing the nodes before and after the target node. The time complexity for adding or deleting a node is `O(1)`.  