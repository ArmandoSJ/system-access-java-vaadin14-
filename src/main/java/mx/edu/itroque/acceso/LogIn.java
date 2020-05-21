package mx.edu.itroque.acceso;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route(value = "login")
public class LogIn extends VerticalLayout {

    //---Componentes vaadin----//
    private TextField txtUser = new TextField("Username or Email");
    private PasswordField pwdUser = new PasswordField("Password");
    private H4 hTitle = new H4("Log In");
    private VerticalLayout vltConte = new VerticalLayout();
    private Button btnLogIn = new Button("login");
    private Button btnSignUp = new Button("sign up");
    public LogIn(){
        inicializar();
        cargaListener();
    }
    private void inicializar(){
        setAlignItems(FlexComponent.Alignment.CENTER);
        btnLogIn.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        btnLogIn.addClickShortcut(Key.ENTER);

        btnSignUp.addThemeVariants(ButtonVariant.LUMO_PRIMARY);


        vltConte.add(hTitle,txtUser,pwdUser,new HorizontalLayout(btnLogIn, btnSignUp));
        add(vltConte);

    }
    private void cargaListener(){
        btnLogIn.addClickListener(this::authentication);
    }

    private void authentication(ClickEvent<Button> buttonClickEvent) {
        System.out.println("it has clicked the btn login");
    }

}
