
public class LinkedList {

	/**
	 * variable
	 */
	public ListElement firstLink;
	public ListElement LastLink;
	
	/**
	 * function
	 */
	
	public boolean isEmpty(){
		return(firstLink == null);
	}
	
	//addElement
	public void addElement(ListElement le){
		le.setNext(firstLink);
		firstLink = le;
	}//end addElement
	
	//getElement
	public ListElement getELement(int index){
		ListElement theNode = firstLink;
		boolean x = true;
		while(theNode != null){
			if(theNode.getData() == index){
				x = true;
				break;
			}else{
				x = false;
				theNode = theNode.getNext();
			}//end if
		}//end while
		
		if(x == true){
			System.out.println("Found number");
		}else{
			System.out.println("no number");
		}//end if
		
		return theNode;
	}//end getElement
	
	public ListElement deleteElement(int index){
		ListElement currentNode = firstLink;
		ListElement previousNode = firstLink;
		while(currentNode.getData() != index){
			if(currentNode.getNext() == null){
				return null;
			}else{
				previousNode = currentNode;
				currentNode = currentNode.getNext();
			}//end if
		}//end while
		
		if(currentNode == firstLink){
			firstLink = firstLink.getNext();
		}else{
			System.out.println("found a match");
			previousNode.setNext(currentNode.getNext());
		}//end if
		return currentNode;
	}//end deleteElement
	
	public void printLinkedList(){
		ListElement link = firstLink;
		while(link != null){
			link.display();
			link = link.getNext();
		}//end while
	}//end printLinkedList
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList myList = new LinkedList();
		ListElement le = new ListElement(5);
		ListElement le0 = new ListElement(6);
		ListElement le1 = new ListElement(7);
		ListElement le2 = new ListElement(8);
		myList.addElement(le);
		myList.addElement(le0);
		myList.addElement(le1);
		myList.addElement(le2);
		myList.printLinkedList();
		
		myList.getELement(6);
		
		myList.deleteElement(6);
		
		myList.printLinkedList();
		
		myList.getELement(6);
		

	}//end main

}
