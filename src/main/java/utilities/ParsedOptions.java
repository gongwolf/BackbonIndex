package utilities;

import java.util.ArrayList;

public class ParsedOptions {

    //Test environment
    public static String db_name = "C9_NY_5K_1";
    public static String sub_k = "1";
    public static String neo4jdbPath = "/home/gqxwolf/mydata/shared_git/BackboneIndex/Data/Neo4jDB";
    public static String GraphInfoPath = "/home/gqxwolf/mydata/shared_git/BackboneIndex/Data/" + db_name;
    public static String output_graphIndo_foler = "/home/gqxwolf/mydata/shared_git/BackboneIndex/Data/" + db_name + "_" + sub_k + "K"; //the place to store the nodes and edge informations
    public static String indexFolder = "/home/gqxwolf/mydata/shared_git/BackboneIndex/Data/Index/";
    public static String logFolder = "/home/gqxwolf/mydata/shared_git/BackboneIndex/Data/logs";
    public static String output_landmark_index_folder = "/home/gqxwolf/mydata/shared_git/BackboneIndex/Data/Index/landmarks";
    public static String resultFolder = "/home/gqxwolf/mydata/shared_git/BackboneIndex/Data/results";
    public static String propertyFile = "/home/gqxwolf/mydata/shared_git/BackboneIndex/Data/logging.properties";

    public static double percentage = 0.01;
    public static int min_size = 200;
    public static int degreeHandle = 0;

    public static final int cost_dimension = 3;

    public static int number_landmark = 3;
    public static ArrayList<Long> landmark_idx_list = null;
    public static boolean createNewLandmarks = true;
    public static int numQuery = 10;
    public static String timestamp;
    public static double p_ind = 30;
    public static int msize = 30;

    public static String clustering_method = "node";
    public static boolean dtw_normal = true;
    public static String logProperties = "/home/gqxwolf/mydata/shared_git/BackboneIndex/Data/logging.properties";
    public static String method = "IndexBuilding";
    public static Integer timeout = 90000;
    public static String info_type = "distribution";
    public static Boolean info_verb = false;
    public static String savedFolder = null;

    //Project Environment
//    public static String db_name = "C9_FLA";
//    public static String GraphInfoPath = "/home/gqxwolf/mydata/projectData/BackBone/data/dataset";
//    public static String neo4jdbPath = "/home/gqxwolf/mydata/backbone/testdb";
//    public static String output_graphIndo_foler = "/home/gqxwolf/mydata/projectData/BackBone/data/dataset";
//    public static String indexFolder = "/home/gqxwolf/mydata/projectData/BackBone/update_exp/Index/";
//    public static String logFolder = "/home/gqxwolf/mydata/projectData/BackBone/update_exp/logs";
//    public static String output_landmark_index_folder = "/home/gqxwolf/mydata/projectData/BackBone/update_exp/Index/landmarks";
//    public static String resultFolder = "/home/gqxwolf/mydata/projectData/BackBone/update_exp/results";
}
