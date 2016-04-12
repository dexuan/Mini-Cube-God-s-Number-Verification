package CubePackage;

class Work {
	public static int step = CubeSheet.getSTEP();
	public int nStep = 1;
	public Work()
	{
		
	}
	
	public void setnStep(int myText)
	{
		nStep=myText;
	}
	
	public int mainWork()//�����Ϊʲô�ǵü���static
	{
		Cube myCube = new Cube();
		CubeSheet myCubeSheet = new CubeSheet();
		
		char[] pathway = new char[step];
		for(int i=0;i<step;i++)pathway[i]=0;
		pathway[step-1]=1;//��0,0,����,1��ʼ����
		
		int dIn = 0;
		int x=0;int y=0;
		
		while(true)
	    {
			myCube.clear();
	        for(int i=step-1;i>=0;i--)
	        {
	            dIn =  (pathway[i]-1);
	            
	            if(dIn>=0 /*&& dIn<=8*/)
	            {
	            	myCube.run(dIn);
	            }
	            else break;
	        }
        	//�⼸��������֤��JinWei����"stop"������������
	        /*for(int i=0;i<step;i++)
	        {
	        	System.out.print(pathway[i] + ",");
	        }
        	System.out.println();*/

	        
	        x=myCube.getNum_A();
	        y=myCube.getNum_T();
	        myCubeSheet.add(x,y,pathway);
	        if(stop(pathway,nStep)){break;}
	        //�ڶ��������ǹؼ���ȱ���˲����γɵݹ�
	        jinwei(pathway,step-1);
	    }
		int result = myCubeSheet.count();	
	    return 	result;
	}
	//����ʲôʱ��ֹͣ
	private  boolean stop(char[] bIn,int aIn)
	{
	    int tIn;
	    if(bIn[step-aIn]!=9)return false;
	    else
	    {
	        for(tIn=step-aIn+1;tIn<step;tIn++)
	        {
	            if(bIn[tIn]!=9&&bIn[tIn]!=6)return false;
	        }
	    }
	    return true;
	}
	//��λ
	private void jinwei(char[] bIn,int aIn)
	{
	    if(bIn[aIn]==9)
	    {

	        jinwei(bIn,aIn-1);
	        if(bIn[aIn-1]<4)bIn[aIn]=4;
	        else bIn[aIn]=1;
	    }
	    else
	    {
	        bIn[aIn]++;
	        if(0<bIn[aIn-1]&&bIn[aIn-1]<4)
	            if(bIn[aIn]==1)
	                bIn[aIn]=4;
	        if(3<bIn[aIn-1]&&bIn[aIn-1]<7)
	            if(bIn[aIn]==4)
	                bIn[aIn]=7;
	        if(bIn[aIn-1]>6&&bIn[aIn-1]<10)
	            if(bIn[aIn]==7)
	            {
	                bIn[aIn]=1;
	                jinwei(bIn,aIn-1);
	            }
	    }
	}
	

}
