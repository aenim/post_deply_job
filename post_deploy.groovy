def param_1 = "textext"
def karta = ['vault1':[['ip':'10.20.30.40', 'port':'443'],['ip':'60.70.80.90', 'port':'8080']], 'vault2':['znachenie2','znachenie3']]
def command_a = "curl -vk https://www.google.com/"
def command_b = "ls -la"
def test_message_1 = 'ololo_${karta}'

pipeline {
    agent any
    parameters {
        choice(name:'Stand', choices:['vault1','vault2'], description:'некоторое описание')
        
    }
    stages {
        stage('первый неработающий стейдж') {
            steps{
                script {
                    currentBuild.displayName = Stand
                    
                    def stand_servers = karta[Stand]
                    stand_servers.each {entry ->
<<<<<<< HEAD
                        print(entry["ip"])    
=======
                        print(entry["ip"])
                        print('message for 2nd branch')
                        
                            
>>>>>>> 32c6bf7a33eef4352435a7bfa06f2984ca6b25b5
                    }      
                }
            }
        }
    }
}