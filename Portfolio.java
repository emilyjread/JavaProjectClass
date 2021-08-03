import java.util.ArrayList;
import java.util.Arrays;

public class Portfolio{
ArrayList<Object> portfolio = new ArrayList<Object>();

public void setProjects(Project p){
    portfolio.add(p);
}
public String[] getProjects(){
    String[] projects= new String[portfolio.size()];

    for (int i=0; i<portfolio.size(); i++){
        projects[i]=portfolio[i]
        
    }
    
        return Arrays.toString(projects);    
    
    
    }
}