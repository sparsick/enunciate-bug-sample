package com.github.sparsick.enunciate.different.pckg;

import javax.ws.rs.QueryParam;

public class QueryParams {

    @QueryParam("aParam")
    private String aParam;

    public String getaParam() {
        return aParam;
    }

    public void setaParam(String aParam) {
        this.aParam = aParam;
    }
}
