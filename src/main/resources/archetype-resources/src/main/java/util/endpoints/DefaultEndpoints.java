package ${package}.util.endpoints;

import io.javalin.apibuilder.EndpointGroup;

import static io.javalin.apibuilder.ApiBuilder.get;
import static io.javalin.apibuilder.ApiBuilder.post;
import static ${package}.Main.URL.Template;
import static ${package}.Main.URL.WEB;

public class DefaultEndpoints implements EndpointGroup{
    @Override
    public void addEndpoints() {
        get(WEB.INDEX, get->{
            get.render(Template.INDEX);
        });
    }
}

