package bitcamp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AdminDispatcherServletInitializer  extends AbstractAnnotationConfigDispatcherServletInitializer {


  @Override
  protected Class<?>[] getRootConfigClasses() {
    // 이미 AppDispatcherServletInitializer에서 설정해서 null리턴.
    return null;
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class<?>[] {AdminConfig.class};
  }


  @Override
  protected String[] getServletMappings() {
    return new String[] {"/admin/*"};
  }

  @Override
  protected String getServletName() {
    return "admin";
  }
}






