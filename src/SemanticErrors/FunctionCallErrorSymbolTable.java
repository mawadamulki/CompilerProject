package SemanticErrors;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FunctionCallErrorSymbolTable {

    List<String> FunctionCall = new ArrayList<String>();
    List<String> FunctionName=new ArrayList<>();
    boolean isItError =false;
    String name;

    public String getName() {
        return name;
    }

    public List<String> getFunctionCallError() {
        return FunctionCall;
    }

    public void setFunctionCallError(List<String> functionCallError) {
        FunctionCall = functionCallError;
    }
    public void addItemFunctionCall(String item){
        FunctionCall.add(item);
    }
    public void addItemFunctionName(String item){
        FunctionName.add(item);
    }


    public boolean checkError(){
        List<String> errors = new ArrayList<>();

        for (String call : FunctionCall) {
            if (!FunctionName.contains(call)) {
                errors.add(call);
            }
        }

        if (!errors.isEmpty()) {
            isItError = true;
            name = errors.get(0); // أو يمكنك طباعة كل الأخطاء
        }

 return (isItError);
}
}
