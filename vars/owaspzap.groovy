def call(Map config = [:]) {
        sh """
          echo Ola ${config.name}. Hoje é ${config.day0Week}.
        """
}
