import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OldMacDonald extends PApplet {

//your variable declarations here
public void setup()
{
	Farm f = new Farm();
	f.animalSounds();
	//Cow c = new Cow("cow", "moo");  
	//Chick en = new Chick("chick","cluck");
	//Pig p = new Pig("pig","oink");

    //System.out.println(c.getType() + " goes " + c.getSound());
    //your java code here
}
interface Animal 
{    
	public String getSound();        
	public String getType(); 
}   
class Farm  
{     
	private Animal[] aBunchOfAnimals = new Animal[3];    
	public Farm()     
	{       
		aBunchOfAnimals[0] = new NamedCow("cow","Elise","moo");           
		aBunchOfAnimals[1] = new Chick("chick","cheep","cluck");
		aBunchOfAnimals[2] = new Pig("pig","oink");    
	}         
	public void animalSounds()    
	  {
    for (int nI=0; nI < aBunchOfAnimals.length; nI++) 
    {             
       System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound() );       
    }       
    System.out.println( "The cow is known as " + ((NamedCow)aBunchOfAnimals[0]).getName() );    
  } 
}
class Cow implements Animal 
{     
	protected String myType;     
	protected String mySound;      
	public Cow(String type, String sound)    
	{         
		myType = type;         
		mySound = sound;     
	}     
	public Cow()    
	{         
		myType = "unknown";         
		mySound = "unknown";     
	}      
	public String getSound(){return mySound;}     
	public String getType(){return myType;} 
}
class Chick implements Animal
{
	private String myType;     
	private String mySound;  

	public Chick(String type, String sound1, String sound2)    
	{         
		myType = type;      
		int a = (int)(Math.random()*2);
		if(a == 0)
		{
			mySound = sound1;
		}
		else if(a == 1)
		{
			mySound = sound2;
		}
	}     
	public Chick()    
	{         
		myType = "unknown";         
		mySound = "unknown";  
	}      
	public String getSound(){return mySound;}     
	public String getType(){return myType;} 

}
class Pig implements Animal
{

	private String myType;     
	private String mySound;      
	public Pig(String type, String sound)    
	{         
		myType = type;         
		mySound = sound;     
	}     
	public Pig()    
	{         
		myType = "unknown";         
		mySound = "unknown";     
	}      
	public String getSound(){return mySound;}     
	public String getType(){return myType;} 
	
}
class NamedCow extends Cow
{
	protected String myName;
	public NamedCow(String type,String name,String sound)
	{
		myName = name;
		myType = type;
		mySound = sound;
	}
	public NamedCow()
	{
		myName = "unknown";
	}
	public String getName(){return myName;} 
}
 //declare classes and the interface below
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OldMacDonald" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
