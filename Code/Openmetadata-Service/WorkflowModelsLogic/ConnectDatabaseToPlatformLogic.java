Class ConnectDatabaseToPlatformLogic impelments Process-Interface{

		boolean Validate(){
			if(Some Logic){
				return true;
			}
			return false;
		}
		
		
		boolean isDBConnected(){
		
			if(dbConncted())
				return true;
			
			return false;
		}
}