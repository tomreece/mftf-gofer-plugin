package com.magento.dom.model.section;

import com.intellij.util.xml.Attribute;
import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericAttributeValue;

import java.util.List;

public interface Section extends DomElement {
    List<Element> getElements();

    @Attribute("name")
    GenericAttributeValue<String> getSectionName();
}
