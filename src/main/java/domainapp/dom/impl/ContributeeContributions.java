package domainapp.dom.impl;

import org.apache.isis.applib.annotation.*;

/**
 * Created by E. de Hair <e.dehair@pocos.nl> on 9/26/17.
 */
@DomainService(nature = NatureOfService.VIEW_CONTRIBUTIONS_ONLY)
public class ContributeeContributions {

    @ActionLayout(contributed = Contributed.AS_ACTION)
    public ContributeeObject actionThatShouldBeHiddenOnRecipientsPage(final ContributeeObject contributee,
                                                                      HelloWorldObject recipient) {
        return contributee;
    }
    public String disableActionThatShouldBeHiddenOnRecipientsPage(final ContributeeObject contributee,
                                                                  HelloWorldObject recipient) {
        /* uncomment this part to make it work again
        if(contributee == null){
            return "Disabled disableActionThatShouldBeHiddenOnRecipientsPage";
        }
        */
        if(!contributee.getName().equals("test")){
            return "Disabled because contributee's name != 'test'";
        }
        return null;
    }
    public boolean hideActionThatShouldBeHiddenOnRecipientsPage(final ContributeeObject contributee,
                                                                HelloWorldObject recipient) {
        return contributee == null; // only show on contributee screen
    }
}
