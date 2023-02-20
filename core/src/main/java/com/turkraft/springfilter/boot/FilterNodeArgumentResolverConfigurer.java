package com.turkraft.springfilter.boot;

import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class FilterNodeArgumentResolverConfigurer implements WebMvcConfigurer {

  private final FilterNodeArgumentResolverHelper filterNodeArgumentResolverHelper;

  public FilterNodeArgumentResolverConfigurer(
      FilterNodeArgumentResolverHelper filterNodeArgumentResolverHelper) {
    this.filterNodeArgumentResolverHelper = filterNodeArgumentResolverHelper;
  }


  @Override
  public void addArgumentResolvers(
      List<HandlerMethodArgumentResolver> resolvers) {
    resolvers.add(new FilterNodeArgumentResolver(filterNodeArgumentResolverHelper));
  }

}
