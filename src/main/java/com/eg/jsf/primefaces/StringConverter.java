package com.eg.jsf.primefaces;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass = String.class)
public class StringConverter implements Converter {
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        if (s == null)
            return null;
        else if (s.trim().length() == 0)
            return null;
        else
            return s.trim();
    }

    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        if (o == null)
            return null;
        else if (((String)o).trim().length() == 0)
            return null;
        else
            return ((String)o).trim();
    }
}
