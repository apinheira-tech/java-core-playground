package br.apinheira.threadlocal;

/**
 * Representa o "contexto de segurança" da execução atual
 * (por exemplo: quem é o usuário logado e qual o seu papel).
 * É um record (Java 16+): imutável, com construtor, getters e toString automáticos.
 */
public record SecurityContext(String usuario, String papel) {
}