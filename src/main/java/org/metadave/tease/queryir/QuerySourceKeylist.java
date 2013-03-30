package org.metadave.tease.queryir;

import java.util.ArrayList;
import java.util.List;

public class QuerySourceKeylist extends QuerySource {
    List<String> keyList = new ArrayList<String>();

    public List<String> getKeyList() {
        return keyList;
    }

    public void setKeyList(List<String> keyList) {
        this.keyList = keyList;
    }
}
