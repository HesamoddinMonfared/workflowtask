Class Parser{
	
	
	void pars(){
		
		Workflow workflow = new Yaml()
                    .loadAs(
                            Main.class.getClassLoader().getResourceAsStream("yaml/Workflow.yml")
                            , Workflow.class);
							
		WorkflowRepository workflowRepository = new WorkflowRepository();			
		ProcessRepository processRepository = new ProcessRepository();
		LinkRepository linkRepository = new LinkRepository();
		
		workflowRepository.addOrUpdate(workflow);
		
		foreach(currentProcess in workflow){
			currentProcess.setLinks(?);
			processRepository.addOrUpdate(currentProcess)
		}
		
		foreach(currentLink in workflow){
			linkRepository.addOrUpdate(currentLink)
		}
		
	}
}