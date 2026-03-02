package Bai_01;

import java.util.Stack;

public class MedicalRecordHistory {
    public Stack<EditAction> history = new Stack<EditAction>();

    public void addEdit(EditAction action){
        history.push(action);
        System.out.println("Đã thêm!");
    }

    public EditAction undoEdit(){
        if(!history.isEmpty()){
            return history.pop();
        } else {
            System.out.println("Không có gì để hoàn tác");
            return null;
        }
    }
    public EditAction getLatestEdit(){
        if(!history.isEmpty()){
            return history.peek();
        } else {
            System.out.println("Chưa có chỉnh sửa nào");
            return null;
        }
    }
    public boolean isEmpty() {
        return history.isEmpty();
    }
    public void displayHistory(){
        if(history.isEmpty()){
            System.out.println("Lịch sử chỉnh sửa rỗng");
            return;
        }
        System.out.println("--- Lịch sử chỉnh sửa ---");
        for (int i = history.size() - 1; i < 0; i--) {
            System.out.println(history.get(i));
        }
    }
}
