package io.pivotal.dmfrey.eventStoreDemo.config;

import io.pivotal.dmfrey.eventStoreDemo.domain.client.BoardClient;
import io.pivotal.dmfrey.eventStoreDemo.domain.model.Board;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.cloud.stream.binder.kafka.streams.KafkaStreamsBinderSupportAutoConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@TestConfiguration
@EnableAutoConfiguration( exclude = { KafkaStreamsBinderSupportAutoConfiguration.class })
public class UnitTestConfig {

    @Bean
    public BoardClient boardClient() {

        return new BoardClient() {

            @Override
            public void save( Board board ) {

                throw new UnsupportedOperationException( "client call not implemented yet" );
            }

            @Override
            public Board find( UUID boardUuid ) {

                throw new UnsupportedOperationException( "client call not implemented yet" );
            }

        };

    }

}
