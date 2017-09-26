package domainapp.dom.impl;

import org.apache.isis.applib.annotation.*;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.VersionStrategy;

/**
 * Created by E. de Hair <e.dehair@pocos.nl> on 9/26/17.
 */
@javax.jdo.annotations.PersistenceCapable(identityType = IdentityType.DATASTORE, schema = "ISIS-1739" )
@javax.jdo.annotations.DatastoreIdentity(strategy = IdGeneratorStrategy.IDENTITY, column = "id")
@javax.jdo.annotations.Version(strategy= VersionStrategy.DATE_TIME, column ="version")
@DomainObject(auditing = Auditing.ENABLED)
@DomainObjectLayout()  // trigger events etc.
@lombok.RequiredArgsConstructor(staticName = "create")
@lombok.Getter @lombok.Setter
public class ContributeeObject {

    @javax.jdo.annotations.Column(allowsNull = "false", length = 40)
    @lombok.NonNull
    @Property(editing = Editing.DISABLED)
    @Title(prepend = "Object: ")
    private String name;


    @javax.jdo.annotations.Column(allowsNull = "true", length = 4000)
    @Property(editing = Editing.ENABLED)
    private String description;
}
