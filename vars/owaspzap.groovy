def call(String url) {
    sh 'docker pull owasp/zap2docker-stable --privileged --name jenkins jenkins'
    sh 'docker run -v $(pwd):/zap/wrk/:rw -t owasp/zap2docker-stable zap-full-scan.py -t ${url} -g gen.conf -r testreport.html --privileged --name jenkins jenkins'
}
