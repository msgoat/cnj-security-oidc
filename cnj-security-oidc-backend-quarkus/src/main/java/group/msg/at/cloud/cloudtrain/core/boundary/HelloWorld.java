package group.msg.at.cloud.cloudtrain.core.boundary;

import group.msg.at.cloud.cloudtrain.core.entity.Message;

import javax.annotation.security.RolesAllowed;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.security.Principal;
import java.util.UUID;

/**
 * Simple {@code Boundary} that returns welcome messages.
 */
@Dependent
@Transactional
@RolesAllowed("CLOUDTRAIN_USER")
public class HelloWorld {

    private static final String WELCOME_MESSAGE_TEMPLATE = "Dear \"%s\", welcome to a cloud native Java application based on MicroProfile protected by OpenID Connect!";

    @Inject
    Principal principal;

    public Message getHelloMessage() {
        return new Message(UUID.randomUUID(), "hello", String.format(WELCOME_MESSAGE_TEMPLATE, getAuthenticatedUserName()));
    }

    private String getAuthenticatedUserName() {
        String result = "anonymous";
        if (principal != null) {
            result = principal.getName();
        }
        return result;
    }

}
