package tr.gov.gib.sf903datajpa.config;

import org.modelmapper.ModelMapper;

public interface ModelMapperConfigurer {
    void configure(ModelMapper modelMapper);
}