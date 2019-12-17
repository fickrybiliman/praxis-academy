package ReactiveStreamJavaDriver;

import com.mongodb.ConnectionString;
import com.mongodb.MongoTimeoutException;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.model.changestream.ChangeStreamDocument;
import com.mongodb.client.model.changestream.FullDocument;
import com.mongodb.reactivestreams.client.ChangeStreamPublisher;
import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import com.mongodb.reactivestreams.client.MongoCollection;
import com.mongodb.reactivestreams.client.MongoDatabase;
import org.bson.BsonDocument;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import static java.lang.String.format;
import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static java.util.concurrent.TimeUnit.SECONDS;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(final String[] args) throws Throwable {
        MongoClient mongoClient;

        // Create a new MongoClient with a MongoDB URI string.
        if (args.length == 0) {
            // Defaults to a localhost replicaset on ports: 27017, 27018, 27019
            mongoClient = MongoClients.create(new ConnectionString("mongodb://localhost:27017,localhost:27018,localhost:27019"));
        } else {
            mongoClient = MongoClients.create(new ConnectionString(args[0]));
        }

        // To directly connect to the default server localhost on port 27017
        MongoClient mongoClient = MongoClients.create();

        MongoDatabase database = mongoClient.getDatabase("examples");

        // Get Collection
        MongoCollection<Document> collection = database.getCollection("test");


    }
}
