/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10threading;

/**
 *
 * @author macstudent
 */
public class Carrier {
    private String message;
    private boolean haveMessage = true;
    /**
     * 
     * @return 
     */
    public synchronized String receiveMessage(){
        while(haveMessage){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        haveMessage = true;
        notifyAll();
                
        return message;
    }
    
   /**
    * 
    * @param message 
    */ 
    public synchronized void sendMessage(String message){
        while(!haveMessage){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Sending the message");
        haveMessage = false;
        this.message = message;
        notifyAll();
    }
    
}
