/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babysitter;
public class GuardianLinkedList{
    //current attribute. would be a profile node not a profile
    private ProfileNode current;
    //next method
    public void next(){
        if (current.getPtrNext()!=null) //needs error handling
            current = current.getPtrNext();
    }
    //hasnext method
    public boolean hasNext(){ //needs error handling
        return current.getPtrNext() != null;
    }
    //previous method
    public void previous(){ //needs error handling
        if(current.getPtrPrevious()!=null)
            current = current.getPtrPrevious();
    }
    //has previous method
    public boolean hasPrevious(){ //needs error handling
        return current.getPtrPrevious()!=null;
    }
    //add method
    public void add(GuardianProfile newProf){ //needs error handling
        while(hasNext())
            next();
        //current = new profileNode(newProf, current.getPtrPrevious(), void);
    }
    //delete method
    public void deleteCurrent(){ //needs error handling
        if (current.getPtrNext()==null){
            previous();
            current.setPtrNext(null);
        }
    }
    //construct list method
    //search(while has next) method
    public GuardianProfile search(String name){ //needs error handling
        while(current.getPoData().getuName()!=name)
            next();
        return current.getPoData();
    }
    //sort(insertion) method
    
}