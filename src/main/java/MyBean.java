import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;


import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

@Named
@SessionScoped

public class MyBean implements Serializable {
    private String name;
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void greet() {
        greeting = "Hello, " + name;
    }


    public void buttonAction(ActionEvent actionEvent) {
            addMessage(name);
    }

    public void addMessage(String summary) {
           FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
           FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
