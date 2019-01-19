package com.idemidov.fsappbackend.mocks;

import com.idemidov.fsappbackend.dao.IThingRepository;
import com.idemidov.fsappbackend.models.dbdto.DThing;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Configuration
@Profile("test")
public class DAOMock {
    @Bean
    @Primary
    public IThingRepository mockThingRepository() {
        List<DThing> things = Arrays.asList(
                new DThing(1, "item1", "desc1"),
                new DThing(2, "item2", "desc2"),
                new DThing(3, "item3", "desc3"),
                new DThing(4, "item4", "desc4"),
                new DThing(5, "item5", "desc5")
        );

        IThingRepository repo = Mockito.mock(IThingRepository.class);
        Mockito.when(repo.findAll()).thenReturn(things);
        Mockito.when(repo.save(Mockito.any())).thenReturn(things.get(0));
        Mockito.when(repo.findById(Mockito.anyInt())).thenReturn(Optional.of(new DThing(255, "test thing", "test thing description")));
        return repo;
    }
}
