 /*======================================================================================*
 * Pipeline for the Regression Tests of the PSRM Application  no Jenkins CI/CD
 * Author: Carlos Almeida 	
 * Job Execution: once every two hours every weekday (perhaps at 9:38 AM, 11:38 AM, 1:38 PM, 3:38 PM)
 *https://jenkins.io/doc/book/pipeline/
 *=======================================================================================*/
pipeline {
 
  agent any
  
  triggers {
        cron('H 9-16/2 * * 1-5')
    }

  stages {
        
      stage('Check') {
      steps {
        
       
          echo "Selenium Java Automation Project - copy chromedriver de /usr/local/bin to  path  /psrm/driver "
       
         
            script {
          
             sh (script: " ls -l /usr/bin/; ls -l /var/lib/jenkins/workspace/SELENIUM/psrmSeleniumAutomation/testData/; ls -l /var/lib/jenkins/workspace/SELENIUM/psrmSeleniumAutomation/evidencias/; ls /var/lib/jenkins/workspace/SELENIUM/psrmSeleniumAutomation/driver/")
             
        }
 
    }
    }
    
    stage('Executing PSRM automated regression tests') {
      steps {
       
          echo "Executando os testes com Selenium WebDriver - SIGT"
          script {
    sh (script: "mvn clean install")
            
          }
        }
     
    }
    
      
    stage('Notificar Execução no Slack') {
      steps {
       
          echo "Informar Execução dos testes"
          script {
   
             slackSend baseUrl: 'https://hooks.slack.com/services/', channel: '#qa-automation-psrm', color: 'good', message: 'Testes automáticos executados - Verificar Build Artifcats para ver evidências', teamDomain: 'Tistech', token: 'TM01KR9CN/BLX4XHF5F/nVCQnqdaU4JbYmrTLdkHOPFJ'
            
          }
        }
     
    }
   
  }
  
  post {
        
           always {
          		echo 'Publish Evidences-Reports on Jenkins'
              
            script {
            
            sh (script: " tar -czvf Evidencias.tar.gz /var/lib/jenkins/workspace/SELENIUM/psrmSeleniumAutomation/evidencias/; ls -l /var/lib/jenkins/workspace/SELENIUM/psrmSeleniumAutomation/evidencias  ")
            
             archiveArtifacts artifacts: '**/Evidencias.tar.gz', fingerprint: true 
          
      		
      		cleanWs();
      		
      		
          }
	 }
       	 
           failure {
           echo 'I failed :('
              script: sendMessage("Existem falhas nos Testes - evidencias publicadas no Jenkins")
         
           script {
            
            sh (script: " tar -czvf Evidencias.tar.gz /var/lib/jenkins/workspace/SELENIUM/psrmSeleniumAutomation/evidencias/; ls -l /var/lib/jenkins/workspace/SELENIUM/psrmSeleniumAutomation/evidencias  ")
            
             archiveArtifacts artifacts: '**/Evidencias.tar.gz', fingerprint: true 
          
      		
      		
      		
      		
          }
       	 
       	 }
       	 success {
           echo ' Build Success!! - Testes executados com sucesso!'
              
       	            
            script {
                slackSend baseUrl: 'https://hooks.slack.com/services/', channel: '#qa-automation-psrm', color: 'good', message: 'Testes Executados com Sucesso. Verificar Build Artifcats para ver evidências Publicadas', teamDomain: 'Tistech', token: 'TM01KR9CN/BLX4XHF5F/nVCQnqdaU4JbYmrTLdkHOPFJ'
          }
       	 
       	 }
       	 
       	
    }
    

  }


