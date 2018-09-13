package View;
import arma.Sight;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RequestScoped
@Path("sight")
public class SightView {
    @Path("/add")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Sight testPost(Sight s){
        System.out.println(s);
        return s;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Sight sayHello(){
        Sight teste = new Sight("aa",1,3,1);
        return teste;
    }
}
