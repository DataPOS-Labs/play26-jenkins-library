def call() {
  return [
    containerTemplate(
      name: 'play26-sbt1-builder',
      image: 'agiledigital/play26-sbt1-builder',
      alwaysPullImage: true,
      command: 'cat',
      ttyEnabled: true
    )
  ]
}