package com.seamew.springbootimport.config;

import com.seamew.springbootenableother.domain.Role;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector
{
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata)
    {
        return new String[] {
            "com.seamew.springbootenableother.domain.User",
            "com.seamew.springbootenableother.domain.Role"
        };
    }
}
