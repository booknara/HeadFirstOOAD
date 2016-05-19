package com.github.booknara.musicshop;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Daehee Han(@daniel_booknara) on 5/10/16.
 */
public class InstrumentSpec {
    private Map<String, String> properties;

    public InstrumentSpec(Map<String, String> properties) {
        if (properties == null)
            this.properties = new HashMap<>();
        else 
            this.properties = new HashMap<>(properties);
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public String getProperty(String key) {
        return properties.get(key);
    }
    
    public boolean matches(InstrumentSpec otherSpec) {
        for (String propertyName : otherSpec.getProperties().keySet()) {
            if(!properties.get(propertyName).equals(otherSpec.getProperty(propertyName)))
                return false;
        }

        return true;
    }
}
