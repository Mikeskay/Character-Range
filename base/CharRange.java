package charrange.base;

import java.lang.*;
public class CharRange {

    private char input;

    public CharRange(char input){
        this.input = input;
        
    }

    public char getInput(){
        return this.input;
    }

    public void setInput(char input){
        this.input = input;
    }

    public boolean isCapital(){
        return Character.isUpperCase(input);
    }

    public boolean isRoman(){

        if (input == 'M'|| input == 'm'|| input == 'D'|| input == 'd'|| input == 'C' ||input == 'c'|| input == 'L' || input == 'l'|| input == 'V'|| input == 'v'|| input == 'I' || input == 'i' ){
    
            return true;
        }
        else{
            return false;
        }
        
    }
    
}
