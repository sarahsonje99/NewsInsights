package URL_req;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.*;

class StrInt
{
	String date;
	int freq;
}

class note{
	String desc;
	String date;
	int Sec;
}
public class description extends note
{
	public static int mysize;
	static int mostused[][] = new int[50000][2];

    static ArrayList<note> AL=new ArrayList<note>();
    static String[] firstOccur1= new String[1000];
    static String[] firstOccur2= new String[1000];
    static int[] firstOccur3= new int[1000];

    static int count = 0 ;

    public static void main(String args[])
    {
        JSONParser parser = new JSONParser();
        


        
        
        try
        {
            Object object = parser.parse(new FileReader("C:\\Users\\Sarah\\Documents\\Second Year Engineering\\InsightsDWP\\src\\Business1.json"));
            JSONObject jsonObject = (JSONObject)object;
            JSONArray a1 = (JSONArray)jsonObject.get("articles");
            String s = null;
            for(int i = 0; i < a1.size(); i++)
            {
               JSONObject myob= (JSONObject)a1.get(i);
               note object1=new note();
              
               object1.desc=myob.get("description").toString();
               String message=myob.get("publishedAt").toString();
             
               for (int i1 = 0; i1 < message.length(); i1 += 10) 
               {
            	  // System.out.println("s is "+s+" and i= "+i1);
            	   if(i1==10)
            		   break;
            	   s=message.substring(i1, Math.min(i1 + 10, message.length()));
               }
               object1.date=s;
               object1.Sec=1;
            
               AL.add(object1);
            
            }
            
            Object object1 = parser.parse(new FileReader("C:\\Users\\Sarah\\Documents\\Second Year Engineering\\InsightsDWP\\src\\Business2.json"));
            JSONObject jsonObject1 = (JSONObject)object1;
            JSONArray a2 = (JSONArray)jsonObject1.get("articles");
           
            for(int i = 0; i < a2.size(); i++)
            {
               JSONObject myob1= (JSONObject)a2.get(i);
               note object2=new note();
              
               object2.desc=myob1.get("description").toString();
               String message=myob1.get("publishedAt").toString();
               for (int i1 = 0; i1 < message.length(); i1 += 10) 
               {
            	  // System.out.println("s is "+s+" and i= "+i1);
            	   if(i1==10)
            		   break;
            	   s=message.substring(i1, Math.min(i1 + 10, message.length()));
               }
               object2.date=s;
               object2.Sec=1;
               AL.add(object2);
            }
            
            
            Object object2 = parser.parse(new FileReader("C:\\Users\\Sarah\\Documents\\Second Year Engineering\\InsightsDWP\\src\\Business3.json"));
            JSONObject jsonObject2 = (JSONObject)object2;
            JSONArray a3 = (JSONArray)jsonObject2.get("articles");
           
            for(int i = 0; i < a3.size(); i++)
            {
               JSONObject myob2= (JSONObject)a3.get(i);
               note object3=new note();
             
               object3.desc=myob2.get("description").toString();
               String message =myob2.get("publishedAt").toString();
               for (int i1 = 0; i1 < message.length(); i1 += 10) 
               {
            	   //System.out.println("s is "+s+" and i= "+i1);
            	   if(i1==10)
            		   break;
            	   s=message.substring(i1, Math.min(i1 + 10, message.length()));
               }
               object3.date=s;
               object3.Sec=1;
               AL.add(object3);
            }
            
            
            
            Object object3 = parser.parse(new FileReader("C:\\Users\\Sarah\\Documents\\Second Year Engineering\\InsightsDWP\\src\\Business4.json"));
            JSONObject jsonObject3 = (JSONObject)object3;
            JSONArray a4 = (JSONArray)jsonObject3.get("articles");
           
            for(int i = 0; i < a4.size(); i++)
            {
               JSONObject myob3= (JSONObject)a4.get(i);
               note object4=new note();
            
               object4.desc=myob3.get("description").toString();
               String message=myob3.get("publishedAt").toString();
               for (int i1 = 0; i1 < message.length(); i1 += 10) 
               {
            	 //  System.out.println("s is "+s+" and i= "+i1);
            	   if(i1==10)
            		   break;
            	   s=message.substring(i1, Math.min(i1 + 10, message.length()));
               }
               object4.date=s;
               object4.Sec=1;
               AL.add(object4);
            }
            
            
            
            Object object4 = parser.parse(new FileReader("C:\\Users\\Sarah\\Documents\\Second Year Engineering\\InsightsDWP\\src\\Banking1.json"));
            JSONObject jsonObject4 = (JSONObject)object4;
            JSONArray a5 = (JSONArray)jsonObject4.get("articles");
           
            for(int i = 0; i < a5.size(); i++)
            {
               JSONObject myob4= (JSONObject)a5.get(i);
               note object5=new note();
              
               object5.desc=myob4.get("description").toString();
               String message=myob4.get("publishedAt").toString();
               
               for (int i1 = 0; i1 < message.length(); i1 += 10) 
               {
            	   //System.out.println("s is "+s+" and i= "+i1);
            	   if(i1==10)
            		   break;
            	   s=message.substring(i1, Math.min(i1 + 10, message.length()));
               }
               object5.date=s;
               object5.Sec=2;
               AL.add(object5);
            }
            
            
            Object object5 = parser.parse(new FileReader("C:\\\\Users\\\\Sarah\\\\Documents\\\\Second Year Engineering\\\\InsightsDWP\\\\src\\\\Banking2.json"));
            JSONObject jsonObject5 = (JSONObject)object5;
            JSONArray a6 = (JSONArray)jsonObject5.get("articles");
           
            for(int i = 0; i < a6.size(); i++)
            {
               JSONObject myob5= (JSONObject)a6.get(i);
               note object6=new note();
            
               object6.desc=myob5.get("description").toString();
               String message=myob5.get("publishedAt").toString();
               for (int i1 = 0; i1 < message.length(); i1 += 10) 
               {
            	   //System.out.println("s is "+s+" and i= "+i1);
            	   if(i1==10)
            		   break;
            	   s=message.substring(i1, Math.min(i1 + 10, message.length()));
               }
               object6.date=s;
               object6.Sec=2;
               AL.add(object6);
            }
            
            
            
            Object object6 = parser.parse(new FileReader("C:\\\\Users\\\\Sarah\\\\Documents\\\\Second Year Engineering\\\\InsightsDWP\\\\src\\\\Banking3.json"));
            JSONObject jsonObject6 = (JSONObject)object6;
            JSONArray a7 = (JSONArray)jsonObject6.get("articles");
           
            for(int i = 0; i < a7.size(); i++)
            {
               JSONObject myob6= (JSONObject)a7.get(i);
               note object7=new note();
          
               object7.desc=myob6.get("description").toString();
               String message=myob6.get("publishedAt").toString();
               for (int i1 = 0; i1 < message.length(); i1 += 10) 
               {
            	   //System.out.println("s is "+s+" and i= "+i1);
            	   if(i1==10)
            		   break;
            	   s=message.substring(i1, Math.min(i1 + 10, message.length()));
               }
               object7.date=s;
               object7.Sec=2;
               AL.add(object7);
            }
            
            
            
            Object object7 = parser.parse(new FileReader("C:\\\\Users\\\\Sarah\\\\Documents\\\\Second Year Engineering\\\\InsightsDWP\\\\src\\\\Banking44.json"));
            JSONObject jsonObject7 = (JSONObject)object7;
            JSONArray a8 = (JSONArray)jsonObject7.get("articles");
           
            for(int i = 0; i < a8.size(); i++)
            {
               JSONObject myob7= (JSONObject)a8.get(i);
               note object8=new note();
              
               object8.desc=myob7.get("description").toString();
              String message=myob7.get("publishedAt").toString();
              for (int i1 = 0; i1 < message.length(); i1 += 10) 
              {
           	   	//System.out.println("s is "+s+" and i= "+i1);
           	   if(i1==10)
           		   break;
           	   s=message.substring(i1, Math.min(i1 + 10, message.length()));
              }
              object8.date=s;
              object8.Sec=2;
               AL.add(object8);
            }
            
            
            Object object8 = parser.parse(new FileReader("C:\\\\Users\\\\Sarah\\\\Documents\\\\Second Year Engineering\\\\InsightsDWP\\\\src\\\\Finance1.json"));
            JSONObject jsonObject8 = (JSONObject)object8;
            JSONArray a9 = (JSONArray)jsonObject8.get("articles");
           
            for(int i = 0; i < a9.size(); i++)
            {
               JSONObject myob8= (JSONObject)a9.get(i);
               note object9=new note();
           
               object9.desc=myob8.get("description").toString();
               String message=myob8.get("publishedAt").toString();
               for (int i1 = 0; i1 < message.length(); i1 += 10) 
               {
            	  // System.out.println("s is "+s+" and i= "+i1);
            	   if(i1==10)
            		   break;
            	   s=message.substring(i1, Math.min(i1 + 10, message.length()));
               }
               object9.date=s;
               object9.Sec=3;
               AL.add(object9);
            }
            
            
            
            Object object9 = parser.parse(new FileReader("C:\\\\Users\\\\Sarah\\\\Documents\\\\Second Year Engineering\\\\InsightsDWP\\\\src\\\\Finance2.json"));
            JSONObject jsonObject9 = (JSONObject)object9;
            JSONArray a10 = (JSONArray)jsonObject9.get("articles");
           
            for(int i = 0; i < a10.size(); i++)
            {
               JSONObject myob9= (JSONObject)a10.get(i);
               note object10=new note();
             
               object10.desc=myob9.get("description").toString();
               String message=myob9.get("publishedAt").toString();
               for (int i1 = 0; i1 < message.length(); i1 += 10) 
               {
            	   //System.out.println("s is "+s+" and i= "+i1);
            	   if(i1==10)
            		   break;
            	   s=message.substring(i1, Math.min(i1 + 10, message.length()));
               }
               object10.date=s;
               object10.Sec=3;
               AL.add(object10);
            }
            
            
            
            Object object10 = parser.parse(new FileReader("C:\\\\Users\\\\Sarah\\\\Documents\\\\Second Year Engineering\\\\InsightsDWP\\\\src\\\\Finance3.json"));
            JSONObject jsonObject10 = (JSONObject)object10;
            JSONArray a11 = (JSONArray)jsonObject10.get("articles");
           
            for(int i = 0; i < a11.size(); i++)
            {
               JSONObject myob10= (JSONObject)a11.get(i);
               note object11=new note();
             
               object11.desc=myob10.get("description").toString();
               String message=myob10.get("publishedAt").toString();
               for (int i1 = 0; i1 < message.length(); i1 += 10) 
               {
            	   //System.out.println("s is "+s+" and i= "+i1);
            	   if(i1==10)
            		   break;
            	   s=message.substring(i1, Math.min(i1 + 10, message.length()));
               }
               object11.date=s;
               object11.Sec=3;
               AL.add(object11);
            }
            
            
            
            Object object11 = parser.parse(new FileReader("C:\\\\Users\\\\Sarah\\\\Documents\\\\Second Year Engineering\\\\InsightsDWP\\\\src\\\\Finance4.json"));
            JSONObject jsonObject11 = (JSONObject)object11;
            JSONArray a12 = (JSONArray)jsonObject11.get("articles");
           
            for(int i = 0; i < a12.size(); i++)
            {
               JSONObject myob11= (JSONObject)a12.get(i);
               note object12=new note();
              
               object12.desc=myob11.get("description").toString();
               String message=myob11.get("publishedAt").toString();
               for (int i1 = 0; i1 < message.length(); i1 += 10) 
               {
            	   //System.out.println("s is "+s+" and i= "+i1);
            	   if(i1==10)
            		   break;
            	   s=message.substring(i1, Math.min(i1 + 10, message.length()));
               }
               object12.date=s;
               object12.Sec=3;
               AL.add(object12);
            }
            
            
            Object object12 = parser.parse(new FileReader("C:\\\\\\\\Users\\\\\\\\Sarah\\\\\\\\Documents\\\\\\\\Second Year Engineering\\\\\\\\InsightsDWP\\\\\\\\src\\\\\\\\Technology1.json"));
            JSONObject jsonObject12 = (JSONObject)object12;
            JSONArray a13 = (JSONArray)jsonObject12.get("articles");
           
            for(int i = 0; i < a13.size(); i++)
            {
               JSONObject myob12= (JSONObject)a13.get(i);
               note object13=new note();
              
               object13.desc=myob12.get("description").toString();
               String message=myob12.get("publishedAt").toString();
               for (int i1 = 0; i1 < message.length(); i1 += 10) 
               {
            	   //System.out.println("s is "+s+" and i= "+i1);
            	   if(i1==10)
            		   break;
            	   s=message.substring(i1, Math.min(i1 + 10, message.length()));
               }
               object13.date=s;
               object13.Sec=4;
               AL.add(object13);
            }
            
            
            Object object13 = parser.parse(new FileReader("C:\\\\\\\\Users\\\\\\\\Sarah\\\\\\\\Documents\\\\\\\\Second Year Engineering\\\\\\\\InsightsDWP\\\\\\\\src\\\\\\\\Technology2.json"));
            JSONObject jsonObject13 = (JSONObject)object13;
            JSONArray a14 = (JSONArray)jsonObject13.get("articles");
           
            for(int i = 0; i < a14.size(); i++)
            {
               JSONObject myob13= (JSONObject)a14.get(i);
               note object14=new note();
             
               object14.desc=myob13.get("description").toString();
               String message=myob13.get("publishedAt").toString();
               for (int i1 = 0; i1 < message.length(); i1 += 10) 
               {
            	   //System.out.println("s is "+s+" and i= "+i1);
            	   if(i1==10)
            		   break;
            	   s=message.substring(i1, Math.min(i1 + 10, message.length()));
               }
               object14.date=s;
               object14.Sec=4;
               AL.add(object14);
            }
            
            
            Object object14 = parser.parse(new FileReader("C:\\\\\\\\Users\\\\\\\\Sarah\\\\\\\\Documents\\\\\\\\Second Year Engineering\\\\\\\\InsightsDWP\\\\\\\\src\\\\\\\\Technology3.json"));
            JSONObject jsonObject14 = (JSONObject)object14;
            JSONArray a15 = (JSONArray)jsonObject14.get("articles");
           
            for(int i = 0; i < a15.size(); i++)
            {
               JSONObject myob14= (JSONObject)a15.get(i);
               note object15=new note();
              
               object15.desc=myob14.get("description").toString();
               String message=myob14.get("publishedAt").toString();
               for (int i1 = 0; i1 < message.length(); i1 += 10) 
               {
            	   //System.out.println("s is "+s+" and i= "+i1);
            	   if(i1==10)
            		   break;
            	   s=message.substring(i1, Math.min(i1 + 10, message.length()));
               }
               object15.date=s;
               object15.Sec=4;
               AL.add(object15);
            }
            
            
            
            Object object15 = parser.parse(new FileReader("C:\\\\\\\\Users\\\\\\\\Sarah\\\\\\\\Documents\\\\\\\\Second Year Engineering\\\\\\\\InsightsDWP\\\\\\\\src\\\\\\\\Technology4.json"));
            JSONObject jsonObject15 = (JSONObject)object15;
            JSONArray a16 = (JSONArray)jsonObject15.get("articles");
           
            for(int i = 0; i < a16.size(); i++)
            {
               JSONObject myob15= (JSONObject)a16.get(i);
               note object16=new note();
              
               object16.desc=myob15.get("description").toString();
               String message=myob15.get("publishedAt").toString();
               for (int i1 = 0; i1 < message.length(); i1 += 10) 
               {
            	   //System.out.println("s is "+s+" and i= "+i1);
            	   if(i1==10)
            		   break;
            	   s=message.substring(i1, Math.min(i1 + 10, message.length()));
               }
               object16.date=s;
               object16.Sec=4;
               AL.add(object16);
            }

            
          // System.out.println(AL.size());
           
//          int m=0;
//           for(int i=0;i<AL.size();i++)
//           {
//            System.out.println("---------------------------------------------------------------------------------------");
//
//        	   System.out.println(AL.get(i).desc);
//        	   System.out.println();
//        	   System.out.println(AL.get(i).date);
//        	   System.out.println(AL.get(i).Sec);
//        	   m=(m+1)%4;
//        	  // System.out.println("---------------------------------------------------------------------------------------");
//           }
//           
//           System.out.println("-----------------------------");
           
          
          
         
         
           	for( int i=0;i<AL.size();i++)
           	{
           		
				 firstOccur1[i]=AL.get(i).desc;
			
           	}
          	//System.out.println(firstOccur1[21]);
            
           	for( int i=0;i<AL.size();i++)
           	{
           		
				firstOccur2[i]=AL.get(i).date;
           	}
           	
           	
           	for( int i=0;i<AL.size();i++)
           	{
           		
				firstOccur3[i]=AL.get(i).Sec;
           	}
           	
           	//System.out.println(firstOccur2[0]);
           	
//           	for(int i=0;i<AL.size();i++)
//           	{
//           		System.out.println(firstOccur1[i]);
//           		System.out.println(firstOccur2[i]);
//           		System.out.println("---------------------------------");
//           	}
        	
           
           // firstOccurance fo = new firstOccurance(firstOccur1, firstOccur2);
           	
           	//fo.gotit();
           	description ob= new description();
           		//ob.whenwasitfirstused();
           		//System.out.println("-----------------------------------------------------");
           	
//           	int choice;
//           	System.out.println("Enter your choice");
//           	System.out.println("1- When was it first used");
//           	System.out.println("2- When was it most used");
//           	System.out.println("3- Which all sections did it occue in and for how many times");
//           	Scanner sc= new Scanner(System.in);
//           	choice=sc.nextInt();
//           	
//           	switch(choice)
//           	{
//           	case 1: System.out.println("Enter the keyword");
//           	
//           		//ob.whenwasitfirstused(sc.next());
//           	break;
//           	case 2: System.out.println("Enter the keyword");
//           		ob.FindFreq(sc.next());
//           	break;
//           	case 3: System.out.println("Enter the keyword");
//           		ob.whichsecandhowmany(sc.next());
//           	break;
//           	default: System.out.println("Wrong input detected");
//           	break;
//           	}
           		
           	
        }catch(Exception e)
        {
        	e.printStackTrace();
        }
        
        
        
        
        
        
        
        
         
    }
    
    
    public void whenwasitfirstused( String keyword)
	{
		
	
	 //String keyword = "Tesla" ;
	 
//	 for(int i=0;i<AL.size();i++)
//    	{
//    		System.out.println(firstOccur1[i]);
//    		System.out.println(firstOccur2[i]);
//    		System.out.println("---------------------------------");
//    	}
	// System.exit(0);
	String year = countkey(firstOccur1,firstOccur2,keyword);
	System.out.println(keyword +"occured first in "+year);
	}

public static String countkey(String s[],String s1[],String key)
{
	int flag = 0,length = s.length, enter=0; ;
	String yy=null;
	String dd=null;
	String mm=null;
	String date1 = null;
	String fdate=null;
	for(int j=0 ; j<AL.size() ; j++)
	{
		
		List<String> list = new ArrayList<>(Arrays.asList(s[j].split(" ")));
		
		
		int size = list.size();
		for(int i=0;i<size;i++)
		{
			if(((String) list.get(i)).equalsIgnoreCase(key))
			{

				date1=s1[j];
				if(enter==0)
				{
					List<String> dts = new ArrayList<>(Arrays.asList(date1.split("-")));
					yy=dts.get(0);
					mm=dts.get(1);
					dd=dts.get(2);
					enter=1;
				}
				else
				{
					List<String> dts1 = new ArrayList<>(Arrays.asList(date1.split("-")));
					if(dts1.get(0).compareTo(yy)==-1)
					{
						yy=dts1.get(0);
					}
					if(dts1.get(1).compareTo(mm)==-1)
					{
						mm=dts1.get(1);
					}
					if(dts1.get(2).compareTo(dd)==-1)
					{
						dd=dts1.get(2);
					}
				}
				
				//System.out.println("j= "+j +" and i= "+i);
				flag=1;
				
			}
		}
		
		
	}
	fdate=yy+"-"+mm+"-"+dd;
	return fdate ;
}



static StrInt[] FindFreq(String keyword){
  // String para="hello this is a mis mistake r u r u ready to solve this ";
	//String keyword="GST";
    int first=0,last=0,index=0;
    int enter=0;
    String[] wordArray=new String[20];
    int m=0,n=0;
    List<String> track = new ArrayList<String>();
   for(int i=0;i<AL.size();i++)
   {
    List<String> list1 = new ArrayList<>(Arrays.asList(firstOccur1[i].split(" ")));
//      if(i==258)
//    {
//    	System.out.println(firstOccur2[i]);
//    	//System.exit(0);
//    }
   
   
   // HashMap<String,Integer> track =new HashMap<String,Integer>();
        int fre=0;
        for(int j=0;j<list1.size();j++){
                        if(list1.get(j).equalsIgnoreCase(keyword)) {
                            fre++;
                        //System.out.print("in");
                       // System.out.println(list1.get(j));
                        }
                            }
        
       // System.out.println(keyword+" "+fre+"  "+i);
        //System.exit(0);
        
        		
        				track.add(firstOccur2[i]);
        				mostused[m][n]=fre;
        				mostused[m][n+1]=i;
        				n=0;
        				m++;
        				
        				//System.out.println("fre= "+fre);
        			
        			
   }
   
//   //System.exit(0);
//   
//   for(int i=0;i<m;i++)
//   {
//	   for(int j=0;j<2;j++)
//	   {
//		   System.out.print(mostused[i][j]+" ");
//	   }
//	   System.out.println();
//   }
    

  
   // System.out.println("***--------------------***");
    description.sort1(m);
   // System.out.println("--------------------");
//    for(int i=0;i<m;i++)
//    {
//    		for(int j=0;j<2;j++)
//    		{
//    				System.out.print(mostused[i][j]+"  ");
//    		}
//    		System.out.println();
//    }
    
//    System.out.println(mostused[m-1][1]);
//    System.out.println(track.get(258));
    for(int i=0; i<track.size(); i++)
    {
    System.out.println("The "+keyword+" occured in "+track.get(mostused[i][1])+ " and was repeated "+ mostused[i][0]+" times "+ firstOccur3[i]);
   }
    
    StrInt[] ans = new StrInt[track.size()];
    for(int i=0; i<track.size(); i++)
    {
    	ans[i].date=track.get(mostused[i][1]);
    	ans[i].freq=mostused[i][0];
    	System.out.println(ans[i].date+"   and    ");
    	System.out.println(ans[i].freq);
    }
    mysize=track.size();
    System.out.println("Size ="+mysize);
    
    
    return ans;
    
    
}

static void sort1(int n)
{
   // System.out.println("HIHIHIHIHIHIHIH");
int temp, temp1;
    // One by one move boundary of unsorted subarray
    for (int i = 0; i < n-1; i++)
    {
        // Find the minimum element in unsorted array
        int min_idx = i;
        for (int j = i+1; j < n; j++)
            if (mostused[j][0] < mostused[min_idx][0])
                min_idx = j;
        
       //.out.println("j= "+min_idx);

        // Swap the found minimum element with the first
        // element
         temp = mostused[min_idx][0];
        mostused[min_idx][0] = mostused[i][0];
        mostused[i][0] = temp;
        
        temp1 = mostused[min_idx][1];
        mostused[min_idx][1] = mostused[i][1];
        mostused[i][1] = temp1;
        
        
    }
//    for(int i=0;i<n;i++)
//    {
// 	   for(int j=0;j<2;j++)
// 	   {
// 		   System.out.print(mostused[i][j]+" ");
// 	   }
// 	   System.out.println();
//    }
//    System.out.println("&&&&&&&&&&&&&&&");
    }
    


public static void whichsecandhowmany(String keyword)
{
	
		//String keyword="GST";
		//int ans[][]= new int [1000][1000];
		int fre1=0, fre2=0, fre3=0, fre4=0;
		int m=0,n=0;
		for(int j=0 ; j<AL.size() ; j++)
		{
			
			List<String> list = new ArrayList<>(Arrays.asList(firstOccur1[j].split(" ")));
			
			
			int size = list.size();
			for(int i=0;i<size;i++)
			{
				if(((String) list.get(i)).equalsIgnoreCase(keyword) && firstOccur3[j]==1 )
				{
						fre1++;
				}
				if(((String) list.get(i)).equalsIgnoreCase(keyword) && firstOccur3[j]==2 )
				{
						fre2++;
				}
				if(((String) list.get(i)).equalsIgnoreCase(keyword) && firstOccur3[j]==3 )
				{
						fre3++;
				}
				 if(((String) list.get(i)).equalsIgnoreCase(keyword) && firstOccur3[j]==4 )
				{
						fre4++;
				}
			}
		}
		
		System.out.println("The keyword "+keyword+" occured in:");
		System.out.println("The Business section "+fre1+ " times");
		System.out.println("The Banking section "+fre2+ " times");
		System.out.println("The Finance section "+fre3+ " times");
		System.out.println("The Technology section "+fre4+ " times");
  
}



}