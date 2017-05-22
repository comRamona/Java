/**
 * Created by rama on 22/05/17.
 */
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import scala.Tuple2;

import java.util.Arrays;
import java.util.List;

import static com.google.common.base.Preconditions.checkArgument;

public class WordCountTask {
    private static final Logger LOGGER = LoggerFactory.getLogger(WordCountTask.class);

    public static void main(String[] args) {

        new WordCountTask().run();
    }

    public void run() {
        // Create a Java Spark Context
        SparkConf conf = new SparkConf().setMaster("local").setAppName("wordCount");
        JavaSparkContext sc = new JavaSparkContext(conf);
        // Load our input data.
        JavaRDD<String> textFile = sc.textFile("hamlet.txt");



        JavaPairRDD<String, Integer> counts = textFile
                .flatMap(s -> Arrays.asList(s.split(" ")).iterator())
                .mapToPair(word -> new Tuple2<>(word, 1))
                .reduceByKey((a, b) -> a + b);


        // now sort by count
        JavaPairRDD<Integer,String> swappedCounts=counts.mapToPair(tuple -> new Tuple2<>(tuple._2,tuple._1));
        JavaPairRDD<Integer,String> sco=swappedCounts.sortByKey(false);
        sco.saveAsTextFile("results.txt");

        List<Tuple2<Integer, String>> take = sco.take(40);
        for(Tuple2<Integer,String> i:take)
            System.out.println(i._2+" -> "+i._1);



    }
}