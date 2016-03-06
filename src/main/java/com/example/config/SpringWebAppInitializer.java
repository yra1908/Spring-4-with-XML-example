package com.example.config;

public class SpringWebAppInitializer {
/*Not working like it should!!
  
  extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        //return new Class<?>[] { WebAppInitializer.class};
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfig.class };
        //return null;
    }

    @Override
    protected String[] getServletMappings() {        
        return new String[] { "/" };
    }
    
    @Override
    protected Filter[] getServletFilters() {
       return new Filter[]{
               new OpenEntityManagerInViewFilter()
            };
    }*/

}
