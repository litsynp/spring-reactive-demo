package com.litsynp.webfluxdemo.api;

import com.litsynp.webfluxdemo.document.Post;
import com.litsynp.webfluxdemo.dto.PostResponseDto;
import com.litsynp.webfluxdemo.repository.ReactivePostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1/posts")
@RequiredArgsConstructor
public class PostController {

    //    private final PostService postService;
//    private final ReactivePostRepository postRepository;
//
//    @GetMapping
//    Flux<Post> list() {
//        return postRepository.findAll();
//    }
//
//    @GetMapping("/{id}")
//    private Mono<Post> detail(@PathVariable String id) {
//        return postRepository.findById(id);
//    }

//
//    @PostMapping
//    public ResponseEntity<PostResponseDto> create(@RequestBody PostCreateRequestDto dto) {
//        Post created = postService.create(dto.toEntity());
//        PostResponseDto response = PostResponseDto.from(created);
//        return ResponseEntity.status(HttpStatus.CREATED).body(response);
//    }
//
//    @GetMapping
//    public ResponseEntity<Page<PostResponseDto>> list(
//            @PageableDefault(sort = "createdOn", direction = Direction.DESC) Pageable pageable,
//            @RequestParam(value = "title", required = false) String title) {
//        Page<Post> posts = postService.search(pageable, title);
//        Page<PostResponseDto> response = posts.map(PostResponseDto::from);
//        return ResponseEntity.ok(response);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<PostResponseDto> detail(@PathVariable String id) {
//        Post found = postService.findById(id);
//        PostResponseDto response = PostResponseDto.from(found);
//        return ResponseEntity.ok(response);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<PostResponseDto> update(
//            @PathVariable String id,
//            @RequestBody PostUpdateRequestDto dto) {
//        Post updated = postService.update(id, dto.toServiceDto());
//        PostResponseDto response = PostResponseDto.from(updated);
//        return ResponseEntity.ok(response);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> delete(@PathVariable String id) {
//        postService.deleteById(id);
//        return ResponseEntity.noContent().build();
//    }
}
