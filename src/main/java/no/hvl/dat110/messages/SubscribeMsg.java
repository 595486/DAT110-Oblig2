package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

	private String user; 
	private String topic;


    public SubscribeMsg(String user, String topic) {

    	this.user = user;
        this.topic = topic; 
    	
    }


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getTopic() {
		return topic;
	}


	public void setTopic(String topic) {
		this.topic = topic;
	}


	@Override
	public String toString() {
		return "SubscribeMsg [user=" + user + ", topic=" + topic + ", getUser()=" + getUser() + ", getTopic()="
				+ getTopic() + ", getType()=" + getType() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
    
    

	// TODO:
	// Implement object variables - a topic is required

	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
		
}
