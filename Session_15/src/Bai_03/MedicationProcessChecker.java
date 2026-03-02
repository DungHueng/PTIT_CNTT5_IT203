package Bai_03;

import java.util.Stack;

public class MedicationProcessChecker {
    private Stack<String> stack = new Stack<>();
    public boolean checkProgress(String[] actions){
        for(String action : actions){
            if (action.equalsIgnoreCase("PUSH")){
                stack.push("ALO");
            }
            else if (action.equalsIgnoreCase("POP")){
                if(stack.isEmpty()){
                    System.out.println("Stack rỗng!");
                    return false;
                }
                stack.pop();
            } else {
                System.out.println("Hành động ko hợp lệ!" + action);
                return false;
            }
        }
        if(stack.isEmpty()){
            System.out.println("Lỗi");
            return false;
        }
        return true;
    }
    public void reset(){
        stack.clear();
    }
}
