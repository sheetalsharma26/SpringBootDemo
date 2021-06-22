@Test(enabled=true)
	public void tc04() {
		RestAssured.baseURI="http://localhost:8081/flights/";
		RequestSpecification request =RestAssured.given();
		
		JSONObject reqParam=new JSONObject();
		//Map<String, String> bookingOne= new HashMap<String, String>();
		reqParam.put("fid", "vyx007");
		reqParam.put("toCity", "Shimla");
		reqParam.put("fromCity", "Agra");
		reqParam.put("totalSeat", "15");
		reqParam.put("bookedSeat", "2");
		reqParam.put("baseFare", "2200");
		request.header("Content-Type", "application/json");
		request.body(reqParam.toJSONString());
		
		Response response=request.request(Method.POST,"/load");
		
		//Response response=request.contentType("application/json").body(list1).request(Method.POST,"/load");
		int resCode= response.getStatusCode();
		String resLine=response.getStatusLine();
		System.out.println("res code ---" + resCode + "=== line=== "+ resLine);
	}
  
  	@Test(enabled=false)
	public void tc01() {
		RestAssured.baseURI="http://localhost:8082/flights/";
		RequestSpecification request =RestAssured.given();
		Response response = request.request(Method.GET,"/all");
		
		String responseBody= response.getBody().asString();
		System.out.println("respose body ---- "+responseBody);
		
		List<String> myList = new ArrayList<String>(Arrays.asList(responseBody.split("},")));
		for(String s:myList)
		System.out.println("my list ====== "+s);
	}
