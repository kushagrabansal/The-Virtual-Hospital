import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.core.Instance;
import java.io.*;
import weka.core.DenseInstance;
import weka.classifiers.trees.J48;


public class BreastCancerModel {

	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// load dataset
		DataSource source = new DataSource("C:\\Users\\HP\\Desktop\\uci weka\\UCI\\breast-cancer.arff");
		Instances dataset = source.getDataSet();
		
		dataset.setClassIndex(dataset.numAttributes()-1);
		
		
		//create and build the classifier
		J48 tree = new J48();
		tree.buildClassifier(dataset);
		
		// Saving our trained model
		weka.core.SerializationHelper.write("C:\\Users\\HP\\Desktop\\breast_cancer_predictor.model", tree);
		// Loading our model 
		J48 tree_trained = (J48)weka.core.SerializationHelper.read("C:\\Users\\HP\\Desktop\\breast_cancer_predictor.model");
	
		
	}

}
