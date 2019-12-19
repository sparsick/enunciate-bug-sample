package com.github.sparsick.enunciate;

import com.github.sparsick.enunciate.different.pckg.QueryParams;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("sample")
public class SampleResource {

    @GET
    @Path("method/{anotherParam}")
    public String aMethod(@BeanParam QueryParams queryParams, @PathParam("anotherParam") String param ) {
        return "";
    }
}
