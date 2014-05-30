package com.example.classdemo;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
String Query = "";
GridView gridView;

static final String[] elements = new String[] {"H","He","Li","Be","B","C","N","O","F","Ne","Na","Mg","Al","Si","P","S","Cl","Ar","K","Ca","Sc","Ti","V","Cr","Mn","Fe","Co","Ni","Cu","Zn","Ga","Ge","As","Se","Br","Kr","Rb","Sr","Y","Zr","Nb","Mo","Tc","Ru","Rh","Pd","Ag","Cd","In","Sn","Sb","Te","I","Xe","Cs","Ba","La","Ce","Pr","Nd","Pm","Sm","Eu","Gd","Tb","Dy","Ho","Er","Tm","Yb","Lu","Hf","Ta","W","Re","Os","Ir","Pt","Au","Hg","Tl","Pb","Bi","Po","At","Rn","Fr","Ra","Ac","Th","Pa","U","Np","Pu","Am","Cm","Bk","Cf","Es","Fm","Md","No","Lr","Rf","Db","Sg","Bh","Hs","Mt","Ds","Rg","Cn","Uut","Fl","Uup","Lv","Uus","Uuo"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN); 
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		EditText ed = (EditText) findViewById(R.id.editText1);
		ed.setKeyListener(null);
		gridView = (GridView) findViewById(R.id.gridView1);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, elements);
		 
				gridView.setAdapter(adapter);
		 
				gridView.setOnItemClickListener(new OnItemClickListener() {
				
					public void onItemClick(AdapterView<?> parent, android.view.View v, int position, long id) {
					  // Toast.makeText(getApplicationContext(),((TextView) v).getText(), Toast.LENGTH_SHORT).show();
						
					   EditText ed = (EditText) findViewById(R.id.editText1);
					  
							   if(((TextView) v).getText().equals("N")){
								   ed.append("N");
							   }
							   
							   if(((TextView) v).getText().equals("F")){
								   ed.append("F");
							   }
							   
							   if(((TextView) v).getText().equals("Ne")){
								   ed.append("Ne");
							   }
							   
							   if(((TextView) v).getText().equals("Na")){
								   ed.append("Na");
							   }
							   
							   if(((TextView) v).getText().equals("Mt")){
								   ed.append("Mt");
							   }
							   
							   if(((TextView) v).getText().equals("Mg")){
								   ed.append("Mg");
							   }
							   
							   if(((TextView) v).getText().equals("Al")){
								   ed.append("Al");
							   }
					   
							   if(((TextView) v).getText().equals("H")){
								   ed.append("H");
							   }
					   
								if(((TextView) v).getText().equals("He")){
									ed.append("He");					   
								}
								if(((TextView) v).getText().equals("Li")){
									ed.append("Li");
								}
								if(((TextView) v).getText().equals("B")){
									ed.append("B");
								}
								if(((TextView) v).getText().equals("Be")){
									ed.append("Be"); 
								}
								if(((TextView) v).getText().equals("C")){
									ed.append("C"); 
								}
								if(((TextView) v).getText().equals("Si")){
									ed.append("Si"); 
								}
								if(((TextView) v).getText().equals("P")){
									ed.append("P");
								}
								if(((TextView) v).getText().equals("S")){
									ed.append("S"); 
								}
								if(((TextView) v).getText().equals("Cl")){
									ed.append("Cl");  
								}
								if(((TextView) v).getText().equals("Ar")){
									ed.append("Ar");  
								}
								if(((TextView) v).getText().equals("K")){
									ed.append("K");  
								}
								if(((TextView) v).getText().equals("Ca")){
									ed.append("Ca");  
								}
								if(((TextView) v).getText().equals("Sc")){
									ed.append("Sc");  
								}
								if(((TextView) v).getText().equals("Ti")){
									ed.append("Ti");  
								}
								if(((TextView) v).getText().equals("V")){
									ed.append("V");  
								}
								if(((TextView) v).getText().equals("Cr")){
									ed.append("Cr");  
								}
								if(((TextView) v).getText().equals("Mn")){
									ed.append("Mn");  
								}
								if(((TextView) v).getText().equals("Fe")){
									ed.append("Fe");  
								}
								if(((TextView) v).getText().equals("Co")){
									ed.append("Co");  
								}
								if(((TextView) v).getText().equals("Ni")){
									ed.append("Ni");  
								}
								if(((TextView) v).getText().equals("Cu")){
									ed.append("Cu");  
								}
								if(((TextView) v).getText().equals("Zn")){
									ed.append("Zn");  
								}
								if(((TextView) v).getText().equals("Ga")){
									ed.append("Ga");  
								}
								if(((TextView) v).getText().equals("Ge")){
									ed.append("Ge");  
								}
								if(((TextView) v).getText().equals("As")){
									ed.append("As");  
								}
								if(((TextView) v).getText().equals("Se")){
									ed.append("Se");  
								}
								if(((TextView) v).getText().equals("Br")){
									ed.append("Br");  
								}
								if(((TextView) v).getText().equals("Kr")){
									ed.append("Kr");  
								}
								if(((TextView) v).getText().equals("Rb")){
									ed.append("Rb");  
								}
								if(((TextView) v).getText().equals("Sr")){
									ed.append("Sr");  
								}
								if(((TextView) v).getText().equals("Y")){
									ed.append("Y");  
								}
								if(((TextView) v).getText().equals("Zr")){
									ed.append("Zr");  
								}
								if(((TextView) v).getText().equals("Nb")){
									ed.append("Nb");  
								}
								if(((TextView) v).getText().equals("Mo")){
									ed.append("Mo");  
								}
								if(((TextView) v).getText().equals("Tc")){
									ed.append("Tc");  
								}
								if(((TextView) v).getText().equals("Ru")){
									ed.append("Ru");  
								}
								if(((TextView) v).getText().equals("Rh")){
									ed.append("Rh");  
								}
								if(((TextView) v).getText().equals("Pd")){
									ed.append("Pd");  
								}
								if(((TextView) v).getText().equals("Ag")){
									ed.append("Ag");  
								}
								if(((TextView) v).getText().equals("Cd")){
									ed.append("Cd");  
								}
								if(((TextView) v).getText().equals("In")){
									ed.append("In");  
								}
								if(((TextView) v).getText().equals("Sn")){
									ed.append("Sn");  
								}
								if(((TextView) v).getText().equals("Sb")){
									ed.append("Sb");  
								}
								if(((TextView) v).getText().equals("Te")){
									ed.append("Te");  
								}
								if(((TextView) v).getText().equals("I")){
									ed.append("I");  
								}
								if(((TextView) v).getText().equals("Xe")){
									ed.append("Xe");  
								}
								if(((TextView) v).getText().equals("Cs")){
									ed.append("Cs");  
								}
								if(((TextView) v).getText().equals("Ba")){
									ed.append("Ba");  
								}
								if(((TextView) v).getText().equals("La")){
									ed.append("La");  
								}
								if(((TextView) v).getText().equals("Ce")){
									ed.append("Ce");  
								}
								if(((TextView) v).getText().equals("Pr")){
									ed.append("Pr");  
								}
								if(((TextView) v).getText().equals("Nd")){
									ed.append("Nd");  
								}
								if(((TextView) v).getText().equals("Pm")){
									ed.append("Pm");  
								}
								if(((TextView) v).getText().equals("Sm")){
									ed.append("Sm");  
								}
								if(((TextView) v).getText().equals("Eu")){
									ed.append("Eu");  
								}
								if(((TextView) v).getText().equals("Gd")){
									ed.append("Gd");  
								}
								if(((TextView) v).getText().equals("Tb")){
									ed.append("Tb");  
								}
								if(((TextView) v).getText().equals("Dy")){
									ed.append("Dy");  
								}
								if(((TextView) v).getText().equals("Ho")){
									ed.append("Ho");  
								}
								if(((TextView) v).getText().equals("Er")){
									ed.append("Er");  
								}
								if(((TextView) v).getText().equals("Tm")){
									ed.append("Tm");  
								}
								if(((TextView) v).getText().equals("Yb")){
									ed.append("Yb");  
								}
								if(((TextView) v).getText().equals("Lu")){
									ed.append("Lu");  
								}
								if(((TextView) v).getText().equals("Hf")){
									ed.append("Hf");  
								}
								if(((TextView) v).getText().equals("Ta")){
									ed.append("Ta");  
								}
								if(((TextView) v).getText().equals("W")){
									ed.append("W");  
								}
								if(((TextView) v).getText().equals("Re")){
									ed.append("Re");  
								}
								if(((TextView) v).getText().equals("Os")){
									ed.append("Os");  
								}
								if(((TextView) v).getText().equals("Ir")){
									ed.append("Ir");  
								}
								if(((TextView) v).getText().equals("Pt")){
									ed.append("Pt");  
								}
								if(((TextView) v).getText().equals("Au")){
									ed.append("Au");  
								}
								if(((TextView) v).getText().equals("Hg")){
									ed.append("Hg");  
								}
								if(((TextView) v).getText().equals("Tl")){
									ed.append("Tl");  
								}
								if(((TextView) v).getText().equals("Pb")){
									ed.append("Pb");  
								}
								if(((TextView) v).getText().equals("Bi")){
									ed.append("Bi");  
								}
								if(((TextView) v).getText().equals("Po")){
									ed.append("Po");  
								}
								if(((TextView) v).getText().equals("At")){
									ed.append("At");  
								}
								if(((TextView) v).getText().equals("Rn")){
									ed.append("Rn");  
								}
								if(((TextView) v).getText().equals("Fr")){
									ed.append("Fr");  
								}
								if(((TextView) v).getText().equals("Ra")){
									ed.append("Ra");  
								}
								if(((TextView) v).getText().equals("Ac")){
									ed.append("Ac");  
								}
								if(((TextView) v).getText().equals("Th")){
									ed.append("Th");  
								}
								if(((TextView) v).getText().equals("Pa")){
									ed.append("Pa");  
								}
								if(((TextView) v).getText().equals("U")){
									ed.append("U");  
								}
								if(((TextView) v).getText().equals("Np")){
									ed.append("Np");  
								}
								if(((TextView) v).getText().equals("Pu")){
									ed.append("Pu");  
								}
								if(((TextView) v).getText().equals("Am")){
									ed.append("Am");  
								}
								if(((TextView) v).getText().equals("Cm")){
									ed.append("Cm");  
								}
								if(((TextView) v).getText().equals("Bk")){
									ed.append("Bk");  
								}
								if(((TextView) v).getText().equals("Cf")){
									ed.append("Cf");  
								}
								if(((TextView) v).getText().equals("Es")){
									ed.append("Es");  
								}
								if(((TextView) v).getText().equals("Fm")){
									ed.append("Fm");  
								}
								if(((TextView) v).getText().equals("Md")){
									ed.append("Md");  
								}
								if(((TextView) v).getText().equals("No")){
									ed.append("No");  
								}
								if(((TextView) v).getText().equals("Lr")){
									ed.append("Lr");  
								}
								if(((TextView) v).getText().equals("Rf")){
									ed.append("Rf");  
								}
								if(((TextView) v).getText().equals("Db")){
									ed.append("Db");  
								}
								if(((TextView) v).getText().equals("Sg")){
									ed.append("Sg");  
								}
								if(((TextView) v).getText().equals("Bh")){
									ed.append("Bh");  
								}
								if(((TextView) v).getText().equals("Hs")){
									ed.append("Hs");  
								}
								if(((TextView) v).getText().equals("Ds")){
									ed.append("Ds");  
								}
								if(((TextView) v).getText().equals("Rg")){
									ed.append("Rg");  
								}
								if(((TextView) v).getText().equals("Cn")){
									ed.append("Cn");  
								}
								if(((TextView) v).getText().equals("Uut")){
									ed.append("Uut");  
								}
								if(((TextView) v).getText().equals("Fl")){
									ed.append("Fl");  
								}
								if(((TextView) v).getText().equals("Uup")){
									ed.append("Uup");  
								}
								if(((TextView) v).getText().equals("Lv")){
									ed.append("Lv");  
								}
								if(((TextView) v).getText().equals("Uus")){
									ed.append("Uus");  
								}
								if(((TextView) v).getText().equals("Uuo")){
									ed.append("Uuo");  
								}
								if(((TextView) v).getText().equals("O")){
									ed.append("O");  
								}
								
								
					   }});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	
	public void StuffButtons(View v) throws FileNotFoundException {
		EditText ed = (EditText) findViewById(R.id.editText1);
		TextView tv = (TextView) findViewById(R.id.Text2);
		
		if (v.getId() == R.id.one) {
	    	ed.append("1");
	    	tv.setText("");
		}
		
		if (v.getId() == R.id.two) {
	    	ed.append("2");
	    	tv.setText("");
		}
		
		if (v.getId() == R.id.three) {
	    	ed.append("3");
	    	tv.setText("");
		}
		
		if (v.getId() == R.id.four) {
	    	ed.append("4");
	    	tv.setText("");
		}
		
		if (v.getId() == R.id.five) {
	    	ed.append("5");
	    	tv.setText("");
		}
		
		if (v.getId() == R.id.six) {
	    	ed.append("6");
	    	tv.setText("");
		}
		
		if (v.getId() == R.id.seven) {
	    	ed.append("7");
	    	tv.setText("");
		}
		
		if (v.getId() == R.id.nine) {
	    	ed.append("9");
	    	tv.setText("");
		}
		
		if (v.getId() == R.id.zero) {
	    	ed.append("0");
	    	tv.setText("");
		}
		
		if (v.getId() == R.id.Clear) {
			ed.setText("");
			tv.setText("");
		}
		
		if (v.getId() == R.id.LeftComma) {
	    	ed.append("(");
	    	tv.setText("");
		}
		
		if (v.getId() == R.id.RightComma) {
	    	ed.append(")");
	    	tv.setText("");
		}
		
		if (v.getId() == R.id.eight) {
			ed.append("8");
			tv.setText("");
		}
		
		if (v.getId() == R.id.plus) {
			ed.append("+");
			tv.setText("");
		}
		if (v.getId() == R.id.minus) {
			ed.append("-");
			tv.setText("");
		}
		if (v.getId() == R.id.backspace) {
			tv.setText("");
			String back = ed.getText().toString();
			if (back.length()>=1){
				String Backed = back.substring(0, back.length()-1); 
				ed.setText(Backed);
				}
		}
		
}
	
public void btnHandler(View v) throws FileNotFoundException {
	EditText ed = (EditText) findViewById(R.id.editText1);
		
		if (v.getId() == R.id.equals) {
			
			final Handler handler = new Handler(){
				
			    @Override
			    public void handleMessage(Message msg) {
			    	Bundle b = msg.getData();
			    	String yosauce = b.get("KEY").toString();
			    	yosauce = yosauce.replace("_", "");
			    	TextView tv = (TextView) findViewById(R.id.Text2);
			    	EditText ed = (EditText) findViewById(R.id.editText1);	
			    	tv.setText(yosauce);
			    	ed.setText("");
			    }
			}; 
			
			String query = ed.getText().toString();
	
			query = query.replace("+", "%2B");
			query = query.replace(" ", "+");
			query = query.replace("=", "%3D");
			query = query.replace("->", "%3D");
			
			if(! query.contains("%3D")){
				query = query + "%3D";
			}
			
			
			Query=query;
			
			
                HTMLBGTASK BG = new HTMLBGTASK(handler);
                BG.execute();
                
                

		}
	}

// ////////////////////LONGBGTASK2
public class HTMLBGTASK extends AsyncTask<Void, Void, String> {
	
	Handler mHandler = null;

	public HTMLBGTASK(Handler handler) {
		this.mHandler = handler;
	}
	
	
    @Override
    protected void onPreExecute() {
    	
    }
    
    public boolean isNumeric(String str)  
    {  
      try  
      {  
        double d = Double.parseDouble(str);  
      }  
      catch(NumberFormatException nfe)  
      {  
        return false;  
      }
      
      return true;  
    }

    @Override
    protected String doInBackground(Void... params) {
    	
    	//We will do number check in the BGTask to avoid crashes.
    	
    	String query = Query;
    	
    	int ii = 0;
    	char FirstCheck = query.charAt(ii);
    	
    	while (Character.isDigit(FirstCheck) == true){
    		Query = Query.replaceFirst(String.valueOf(FirstCheck), "");
    		ii=ii+1;
    		FirstCheck = query.charAt(ii);
    	}
    	
//    	int index = 0;
//    	List<Integer> l = new LinkedList<Integer>();
//    	
//    	
//    	while((index = query.indexOf('+',index)) != -1) {
//    		index = query.indexOf('+', index);
//    	    l.add(index); 
//    	    index++;
//    	}
//    	
//    	for(int i=0; i<l.size()-1; i++){
//    		int DAONE = query.charAt(l.get(i));
//    		int DATWO = DAONE+1;
//    		
//    		
//    		while(isNumeric(String.valueOf(query.charAt(DATWO)))==true){
//    			Query = Query.replaceFirst(String.valueOf(Query.charAt(DATWO)), "");
//    			DATWO++;
//    		}
//    		
//    	}
    	

    	String url = "http://api.wolframalpha.com/v2/query?input="+Query+"&appid=W82RQ4-VW5975UY64";
//    	Document j = null;
    	String BingAnswer= "'"+Query+"'" + "  Is Not Recognized As A Vaild Chemical Equation";
    	
       try{
    	   
    	  
           DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
           DocumentBuilder b = f.newDocumentBuilder();
           Document doc = b.parse(url);
           doc.getDocumentElement().normalize();
           
                      
           NodeList items  = doc.getElementsByTagName("pod");
           
           boolean Answered = false;
           
         while(Answered == false){  
           for(int i=0; i<items.getLength(); i++){
               Node n = items.item(i);
               NodeList nl = n.getChildNodes();

               for(int j = 0; j<nl.getLength(); j++){
	               String nodeText = nl.item(j).getTextContent(); 
	               String answer = nodeText.replace(" ", "");
	               answer = nodeText.replace("\t", "");
	               answer = nodeText.replace("\n", "");
	               
	               if(answer.contains("-->")){
	            	   BingAnswer = answer;
	            	   Answered = true;
	               } 
	               
//	               else if(answer.contains("->")){
//	            	   BingAnswer = answer;
//	               } 
	               
	               else if (answer.contains("reactants")){
	            	   BingAnswer =  "'"+Query+"'" + "  Cannot Be Solved";
	               }
               }
           }
           Answered = true;
       }
           Log.d("BingAnswer=",BingAnswer);
//        	//API URL http://api.wolframalpha.com/v2/query?input=pi&appid=4EQYLA-PV2X39AH2A
//            // App ID 4EQYLA-PV2X39AH2A
//        	
//        	j = Jsoup.connect(URL).timeout(0).get();
//        	//String jj = j.toString();
//        	
//        	if (j!=null){
//        		//Log.d("j=", j.toString());
//        		
//        		//j = Jsoup.parseBodyFragment(jj);
////        		
//	        	Elements elems = j.getAllElements();//"Balanced equation");
//	        	Element elmo = elems.get(0);
//	        	Elements elle = elmo.getAllElements();
//	        	Element io = elle.get(0);
//	        	Elements ioo = io.getAllElements();
//
//	        	for (int i=0; i<ioo.size(); i++){
//	        		Log.d("--", "--");
//	        		Log.d(String.valueOf(i), String.valueOf(ioo.get(i)) );
//	        		Log.d("--", "--");
//	        	}
//	        	
//	        	Element elem = elems.get(1);
////	        	
////	        	Elements Again = elem.getElementsByTag("plaintext");
////	        	
////	        	Element yo = Again.first();
////	        	
////	        	Elements Answer = yo.getElementsContainingText("NewBalancedEquation:ChemicalReactionData");
//	        	
//	        	Log.d("Elems=", elem.toString());
//	        	//Element plaintext = elem.getElementById("plaintext");
//	        	
//	        	//String Answer = plaintext.toString();
//	        	
//	        	//Log.d(Answer, Answer);
        	
        	
        	
        	
                } catch (Exception e) {
                    Log.d("ERROR",e.toString());
                }
            
         Bundle bundle = new Bundle();
		 bundle.putString("KEY",BingAnswer);
		 Message msg = new Message();
		 msg.setData(bundle);
		 mHandler.obtainMessage();
		 mHandler.sendMessage(msg);
		 

        return BingAnswer;
    }

    protected void onProgressUpdate(Integer... progress) {

    }

    protected void onPostExecute(Void v) {

    }

	
  }


}
