package AST;

import java.util.ArrayList;
import java.util.List;

public class App  {
    List<ImportStatement> importStatement = new ArrayList<ImportStatement>();
    List<AppContent> appContent = new ArrayList<AppContent>();

    public List<ImportStatement> getImportStatement() {
        return importStatement;
    }

    public void setImportStatement(List<ImportStatement> importStatement) {
        this.importStatement = importStatement;
    }

    public List<AppContent> getAppContent() {
        return appContent;
    }

    public void setAppContent(List<AppContent> appContent) {
        this.appContent = appContent;
    }


    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < appContent.size(); i++) {
            if(i != appContent.size() - 1){
                stringBuilder.append(appContent.get(i)).append("\n\n");
            } else {
                stringBuilder.append(appContent.get(i));
            }
        }

        StringBuilder stringBuilder1 = new StringBuilder();

        for (int i = 0; i < importStatement.size(); i++) {
            if(i != importStatement.size() - 1){
                stringBuilder1.append(importStatement.get(i)).append(" \n");
            } else {
                stringBuilder1.append(importStatement.get(i));
            }
        }

        return
                 stringBuilder1.toString() + "\n\n" +
                 stringBuilder.toString() + '\n'
                ;
    }

}
